# Library Management System

This Library Management System is designed to manage books, users (students and teachers), and borrowing/returning books.

## Book Class

### `Book`

- Properties:
  - `title`: Retrieves the title of the book.
  - `author`: Retrieves the author of the book.
  - `yearOfPublication`: Retrieves the year of publication of the book.
- Methods:
  - `getTitle()`: Retrieves the title of the book.
  - `getAuthor()`: Retrieves the author of the book.
  - `getYearOfPublication()`: Retrieves the year of publication of the book.

### `Novel` and `Textbook` Subclasses

- Subclasses of `Book`.
- Each subclass contains a `displayInformation()` method that displays specific details.

## Library Class

### `Library`

- Contains a list of `Book` instances.
- Methods:
  - `addBook()`: Adds books to the library inventory.
  - `removeBook()`: Removes books from the library inventory.
  - `listAllBooks()`: Lists all books currently available in the library.

## LibraryUser Interface

### `LibraryUser` Interface

- Methods:
  - `borrowBook()`: Allows borrowing a book from the library.
  - `returnBook()`: Allows returning a borrowed book to the library.
  - i didn't implement the whole code of the returnbook and borrowbook functions

### `Student` and `Teacher` Classes

- Implement the `LibraryUser` interface.
- Define methods such as `borrowBook()` and `returnBook()` accordingly.

## LibraryCard Class

### `LibraryCard`

- Composed within both `Student` and `Teacher` classes.
- Manages borrowing and returning books with respect to the LibraryUser interface.


