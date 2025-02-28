person1.name
person1.age
person1.sayHello()
person1
person1.name
person1
person2
person1.sayHello()
person1.haveBirthday()
class Person { String name; int age; double height; String bloodtype; Person(String n, int a, double h, String bt){ name = n; age = a; height = h; bloodtype = bt;} void printDetails() { System.out.println("Name: " + name); System.out.println("Age: " + age); System.out.println("Height: " + height); System.out.println("Bloodtype: " + bloodtype);} boolean isAdult() { return age >= 18;} boolean requiredBloodtype() { return bloodtype == "AB";}}
person.printDetails()
person.printDetails()
Person person = new Person("Billy", 20, 45, "O+");
Person person1 = new Person("Mandy", 22, 48, "AB-");
Person person2 = new Person("Irwin", 21, 50, "A+");
person2.printDetails()
System.out.println(person2.requiredBloodtype())
Person person3 = new Person("Eris", 357, 60, "AB");
System.out.println(person3.requiredBloodtype())
System.out.println(person3.isAdult())
System.out.println(person1.isAdult())
System.out.println(person2)