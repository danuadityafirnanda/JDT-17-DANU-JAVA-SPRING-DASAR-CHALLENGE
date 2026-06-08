# Spring Framework Basic Coding Challenge

## Overview

Dokumen ini berisi serangkaian coding challenge yang dirancang untuk membantu peserta memahami konsep dasar Spring Framework, khususnya:

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Bean Management
- Bean Scope
- Bean Lifecycle
- Configuration Class
- Spring Component Scanning

Target peserta adalah developer yang baru memulai belajar Spring Framework.

---

# Challenge 1 – Membuat Bean Pertama

## Objective

Memahami bagaimana Spring mengelola object menggunakan IoC Container.

## Requirement

Buat class berikut:

java @Component public class GreetingService {      public String sayHello() {         return "Hello Spring";     } }

Panggil bean tersebut dari Application Context dan tampilkan hasilnya.

## Expected Output

text Hello Spring

## Learning Outcome

- Memahami Bean
- Memahami IoC Container
- Memahami @Component

---

# Challenge 2 – Dependency Injection

## Objective

Memahami bagaimana Spring melakukan Dependency Injection.

## Requirement

Buat class:

java @Component public class MessageService {      public String getMessage() {         return "Welcome To Spring";     } }

java @Component public class GreetingService {      private final MessageService messageService;      public GreetingService(MessageService messageService) {         this.messageService = messageService;     }      public void greet() {         System.out.println(messageService.getMessage());     } }

## Expected Output

text Welcome To Spring

## Learning Outcome

- Constructor Injection
- Dependency Injection
- Bean Collaboration

---

# Challenge 3 – Multiple Bean Implementation

## Objective

Memahami masalah Multiple Bean Candidate.

## Requirement

Buat interface:

java public interface Animal {     String sound(); }

Implementasi:

java @Component public class Cat implements Animal {      @Override     public String sound() {         return "Meow";     } }

java @Component public class Dog implements Animal {      @Override     public String sound() {         return "Woof";     } }

Inject interface Animal ke Service.

## Questions

1. Apa yang terjadi saat aplikasi dijalankan?
2. Mengapa terjadi error?
3. Bagaimana memperbaikinya menggunakan:
    - @Primary
    - @Qualifier

## Learning Outcome

- Bean Resolution
- Multiple Bean Candidate
- @Primary
- @Qualifier

---

# Challenge 4 – Bean Scope

## Objective

Memahami perbedaan Singleton dan Prototype.

## Requirement

Buat bean:

java @Component @Scope("prototype") public class UserSession {  }

Ambil bean dua kali dari Application Context.

## Questions

Bandingkan hasil:

java System.out.println(session1 == session2);

Apa hasilnya?

Bagaimana jika scope diubah menjadi Singleton?

## Learning Outcome

- Singleton Scope
- Prototype Scope

---

# Challenge 5 – Configuration Class

## Objective

Memahami cara membuat Bean menggunakan Java Configuration.

## Requirement

Buat configuration:

java @Configuration public class AppConfig {      @Bean     public String applicationName() {         return "Spring Basic Training";     } }

Ambil bean tersebut dari Application Context.

## Expected Output

text Spring Basic Training

## Learning Outcome

- @Configuration
- @Bean
- Java Configuration

---

# Challenge 6 – Mini Calculator

## Objective

Menggabungkan konsep Bean dan Dependency Injection.

## Requirement

Buat service:

java CalculatorService

Method yang wajib tersedia:

java add() subtract() multiply() divide()

Buat Runner yang menggunakan service tersebut.

## Expected Output

text 10 + 5 = 15 10 - 5 = 5 10 * 5 = 50 10 / 5 = 2

## Learning Outcome

- Service Layer
- Dependency Injection
- Business Logic Separation

---

# Challenge 7 – Bean Lifecycle

## Objective

Memahami lifecycle Bean pada Spring.

## Requirement

Buat bean:

java @Component public class DatabaseConnection {  }

Gunakan:

java @PostConstruct

untuk menampilkan:

text Database Connected

Gunakan:

java @PreDestroy

untuk menampilkan:

text Database Disconnected

## Learning Outcome

- Bean Initialization
- Bean Destruction
- Lifecycle Callback

---

# Challenge 8 – Student Management

## Objective

Menggabungkan seluruh konsep dasar Spring.

## Requirement

Buat:

java Student StudentRepository StudentService

Data disimpan menggunakan:

java List<Student>

Fitur:

1. Tambah Student
2. Cari Student berdasarkan ID
3. Tampilkan seluruh Student

## Sample Output

text === Student List ===  
1 - Budi 
2 - Andi 
3 - Siti

## Learning Outcome

- Repository Pattern
- Service Layer
- Dependency Injection
- Bean Management

---

# Final Challenge – Mini Library System

## Objective

Menerapkan seluruh konsep Spring Basic dalam satu mini project.

## Requirement

Buat:

java Book BookRepository BookService LibraryRunner

Fitur:

1. Tambah Buku
2. Cari Buku
3. Tampilkan Seluruh Buku

Data disimpan menggunakan Collection.

## Sample Output

text === Library ===  1. Clean Code 2. Spring In Action 3. Effective Java

## Evaluation Criteria

| No | Criteria | Score |
|----|----------|--------|
| 1 | Bean Creation | 20 |
| 2 | Dependency Injection | 20 |
| 3 | Component Scan | 10 |
| 4 | Bean Scope | 10 |
| 5 | Bean Lifecycle | 10 |
| 6 | Service Layer Design | 15 |
| 7 | Code Readability | 15 |

Total Score: 100

---

## Bonus Challenge

Refactor seluruh project menggunakan:

java @RequiredArgsConstructor

dari Lombok.

Jelaskan keuntungan Constructor Injection dibanding Field Injection.

