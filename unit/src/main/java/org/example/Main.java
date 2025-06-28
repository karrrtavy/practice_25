package org.example;

// import java.io.IOException;

// import lombok.Setter;
// import lombok.Getter;
// import lombok.Builder;

// @Builder
// @Data
// class User {
//     // lamboc сам создат геттеры и сеттеры с помощью аннотаций
//     @Getter
//     @Setter

//     private String name;
//     private int age;

//     public User(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

// }

// // рекорды по дефолту константы, а также не могут наследовать другие классы
// // имутабельность полезна при многопоточном программировании
// record User2(String name, int age) {
    
// }

// class User {
//     private String name;
//     private int age;
//     private Boolean gender; // для булевых используется is вместо get

//     public User(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }

// }

// // утилитные классы
// final class FooUtil {
//     private FooUtil() {}

//     public static String readLine() {
//         return "";
//     }
// }

// // unchecked исключение
// class MyException extends RuntimeException {
//     public MyException(String message) {
//         super(message);
//     }
// }

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Строки - неизменяемый объект
        // String str = "Hello";
        // String str2 = new String("Hello");
        // String str3 = str + str2;

        // // в реальности будет создана новая строка
        // str = str + "test";

        // shell^ bash;
        // time, date, cd, pwd, help

        // StringBuilder sb = new StringBuilder();
        // sb.append("test");
        // sb.append("2");
        // sb.append(".");
        // sb.append("test");

        // String value = sb.toString();
        // System.out.println(value);
        // стрингбилдет - непотокобезопасной
        // стрингбуфер потокобезопасный, но медленнее работает

        // String str = "vsdvasdvdf\n" + 
        //              "fsdfdsfdsd\n" +
        //              "fsdfdsf";
        
        // String str2 = """
        //         this is a test.
        //         this is a test;
        //         """;

        // foo();

        // обобщенное программирование (дженерики)

    }

    // public static void foo() throws IOException {
    //     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //     reader.readLine();
    // }

}