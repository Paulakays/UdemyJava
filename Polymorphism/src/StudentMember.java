/**
 * Author: Pauline
 * User: pauli
 * Date: 03/04/2025
 * Time: 12:11
 */

// Subclass representing a Student Member
class StudentMember extends LibraryMember {

    // Constructor for StudentMember
    public StudentMember(String name) {
        super(name); // Call the constructor of the base class
    }

    // Overriding the borrowBook method for StudentMember
    @Override
    public void borrowBook() {
        System.out.println(name + " can borrow up to 3 books.");
    }
}
