module com.example.bookborrowingsystem {
        requires javafx.controls;
        requires javafx.fxml;


        opens com.example.bookborrowingsystem to javafx.fxml;
        exports com.example.bookborrowingsystem;
}