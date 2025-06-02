public class Catalog {
    private String authorName;
    private int noOfCopies;

    public void updateInfo() {
        // Update catalog info
    }

    public void searching() {
        // Search in catalog
    }
}


public class Librarian {
    public String name;
    public String address;
    public int mobileNo;

    public void updateInfo() {
        // Update librarian info
    }

    public void memberInfo() {
        // View or edit member info
    }

    public void issueBooks() {
        // Issue books
    }

    public void searchBk() {
        // Search books
    }

    public void returnBk() {
        // Return books
    }
}


public class Books {
    public String authorName;
    public int noOfBooks;

    public void removeFromCatalog() {
        // Remove book from catalog
    }

    public void addToCatalog() {
        // Add book to catalog
    }
}


import java.util.Date;

public class Alert {
    public Date issueDate;
    public String bookName;
    public Date returnDate;
    public int fine;

    public void viewAlert() {
        // View alert
    }

    public void fineCall() {
        // Calculate fine
    }

    public void deleteAlertByNo() {
        // Delete alert by number
    }
}


public class Member {
    public String mName;
    public String mAddress;
    public int mNo;

    public void mRequestForBk() {
        // Request for book
    }

    public void mReturnBk() {
        // Return book
    }
}

public class FacultyMember extends Member {
    public String fName;

    public void checkoutBk() {
        // Checkout book
    }
}


public class Students extends Member {
    public String sName;
    public String studentCall;

    public void checkoutBk() {
        // Checkout book
    }

    public void returnBk() {
        // Return book
    }
}