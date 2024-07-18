package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/batch7293";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        // Create the Employee table if it does not exist
        createEmployeeTable();

        // Try-with-resources to ensure resources are closed after use
        try (Scanner scanner = new Scanner(System.in);
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root")) {

            boolean exit = false;  // Flag to control the loop

            // Loop until the user chooses to exit
            while (!exit) {
                // Display the menu options
                System.out.println("Choose an operation:");
                System.out.println("1: Insert");
                System.out.println("2: Retrieve");
                System.out.println("3: Update");
                System.out.println("4: Delete");
                System.out.println("5: Exit");

                // Read the user's choice
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline character

                // Perform action based on user's choice
                switch (choice) {
                    case 1:
                        insertEmployee(conn, scanner);  // Call method to insert an employee
                        break;
                    case 2:
                        retrieveEmployees(conn);  // Call method to retrieve employees
                        break;
                    case 3:
                        updateEmployee(conn, scanner);  // Call method to update an employee
                        break;
                    case 4:
                        deleteEmployee(conn, scanner);  // Call method to delete an employee
                        break;
                    case 5:
                        exit = true;  // Set exit flag to true to break the loop
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");  // Invalid input
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }

    // Method to create the Employee table if it does not exist
    private static void createEmployeeTable() {
        // Try-with-resources to ensure resources are closed after use
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {

            // SQL query to create Employee table if it doesn't already exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee ("
                                    + "empId INT PRIMARY KEY AUTO_INCREMENT, "
                                    + "empName VARCHAR(100), "
                                    + "empEmail VARCHAR(100), "
                                    + "empRole VARCHAR(100), "
                                    + "empSalary DOUBLE)";
            // Execute the SQL query
            stmt.executeUpdate(createTableSQL);
            System.out.println("Employee table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }

    // Method to insert an employee into the database
    private static void insertEmployee(Connection conn, Scanner scanner) {
        // Prompt for employee details
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Employee Role:");
        String role = scanner.nextLine();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline character

        // SQL query to insert an employee
        String insertSQL = "INSERT INTO Employee (empName, empEmail, empRole, empSalary) VALUES (?, ?, ?, ?)";

        // Try-with-resources to ensure PreparedStatement is closed
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);  // Set employee name
            pstmt.setString(2, email);  // Set employee email
            pstmt.setString(3, role);  // Set employee role
            pstmt.setDouble(4, salary);  // Set employee salary
            pstmt.executeUpdate();  // Execute the insert statement
            System.out.println("Employee inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }

    // Method to retrieve all employees from the database
    private static void retrieveEmployees(Connection conn) {
        // SQL query to select all employees
        String selectSQL = "SELECT * FROM Employee";

        // Try-with-resources to ensure PreparedStatement and ResultSet are closed
        try (PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {

            // Print all employee records
            while (rs.next()) {
                int id = rs.getInt("empId");  // Get employee ID
                String name = rs.getString("empName");  // Get employee name
                String email = rs.getString("empEmail");  // Get employee email
                String role = rs.getString("empRole");  // Get employee role
                double salary = rs.getDouble("empSalary");  // Get employee salary
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Role: " + role + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }

    // Method to update an employee's salary in the database
    private static void updateEmployee(Connection conn, Scanner scanner) {
        // Prompt for employee ID and new salary
        System.out.println("Enter Employee ID to update:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        System.out.println("Enter new Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline character

        // SQL query to update employee's salary
        String updateSQL = "UPDATE Employee SET empSalary = ? WHERE empId = ?";

        // Try-with-resources to ensure PreparedStatement is closed
        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            pstmt.setDouble(1, salary);  // Set new salary
            pstmt.setInt(2, id);  // Set employee ID
            pstmt.executeUpdate();  // Execute the update statement
            System.out.println("Employee updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }

    // Method to delete an employee from the database
    private static void deleteEmployee(Connection conn, Scanner scanner) {
        // Prompt for employee ID to delete
        System.out.println("Enter Employee ID to delete:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        // SQL query to delete employee
        String deleteSQL = "DELETE FROM Employee WHERE empId = ?";

        // Try-with-resources to ensure PreparedStatement is closed
        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);  // Set employee ID
            pstmt.executeUpdate();  // Execute the delete statement
            System.out.println("Employee deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();  // Print stack trace for SQL exceptions
        }
    }
}
