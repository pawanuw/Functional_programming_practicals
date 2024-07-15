object ques_2 extends App {
    case class Book(title:String, author:String, isbn:String)

    var book1 = Book("MatBook","Kasun","KMB123")
    var book2 = Book("SciBook","Amara","ASB234")
    var book3 = Book("PhyBook","Saman","SPB789")
    var book4 = Book("ChemBook","Saman","SCB567")
    var books = Set[Book] (book1,book2,book3)

    def addNewBook():Any={
        var title = scala.io.StdIn.readLine("Enter book title: ")
        var author = scala.io.StdIn.readLine("Author?: ")
        var isbn = scala.io.StdIn.readLine("ISBN?: ")

        val temp_book = Book(title, author, isbn)
        books += temp_book
        println("New book added!")
    }

    def removeBook(isbn:String):Any={
        var done:Boolean = false
        for (book <- books) {
            if (isbn == book.isbn) {
                books -= book
                println("Target book deleted!")
                done = true
            }
        }
        if (done == false) println("No such a book!")
    }

    def isThere(isbn:String):Any={
        var done:Boolean = false
        for (book <- books) {
            if (isbn == book.isbn) {
                println(s"Book $isbn is available!")
            }
        }
        if (done == false) println("OOPS, book not found :(")
    }

    def availableBooks():Any={
        println("Title\tAuthor\tISBN")
        for (book <- books) {
            println(s"${book.title}\t${book.author}\t${book.isbn}")
        }
        println()
    }

    def searchByTitle(title:String):Any={
        var done:Boolean = false
        for (book <- books) {
            if (title == book.title) {
                println(s"${book.title}\t${book.author}\t${book.isbn}")
                done = true
            }
        }
        if (done == false) println("Mmm... No any book with that title.")
    }

    def searchByAuthor(author:String):Any={
        var done:Boolean = false
        for (book <- books) {
            if (author == book.author) {
                println(s"${book.title}")
            }
        }
    }


    var running:Boolean = true
    var option:String = "0"
    while (running) {
        println("Enter '+' to add new book.\nEnter '-' to remove a book.\nEnter 'c' to check for a book.\nEnter 'p' to print details of existing books.\nEnter 't' to search for a book with title.\nEnter 'a' to search for a certain author's books.\nEnter 'q' to exit.")
        println()
        option = scala.io.StdIn.readLine("Enter your prompt: ")
        if (option == "+") addNewBook()
        else if (option == "-") {
            var isbn = scala.io.StdIn.readLine("Enter ISBN: ")
            removeBook(isbn)
        }
        else if (option == "c") {
            var isbn = scala.io.StdIn.readLine("Enter ISBN: ")
            isThere(isbn)
        }
        else if (option == "p") availableBooks()
        else if (option == "t") {
            var title = scala.io.StdIn.readLine("Enter book title: ")
            searchByTitle(title)
        }
        else if (option == "a") {
            var author = scala.io.StdIn.readLine("Enter book author: ")
            searchByAuthor(author)
        }
        else if (option == "q") running = false
        else println("Invalid input!")
    }
}