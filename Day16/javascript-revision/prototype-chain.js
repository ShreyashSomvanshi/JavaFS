function Person(name, age){
    this.name = name;
    this.age = age;
}

// adding a method to the prototype
Person.prototype.greet = function(){
    console.log(`Hello my name is ${this.name} and my age is ${this.age}.`);
    
}

function Student(name, age, grade){
    Person.call(this, name, age); // call from parent constructor
    this.grade = grade;
}

// inherit methods from person prototype
Student.prototype = Object.create(Person.prototype);
// Add a new method to student prototype
Student.prototype.study = function(){
    console.log(`${this.name} is studying`);
};

// creating instance of student 
const s1 = new Student('Dave', 20, 'A');
s1.greet(); // inherited from Person prototype
s1.study(); // defined in student prototype

console.log(s1.__proto__);
console.log(s1.__proto__.__proto__);
console.log(s1.__proto__.__proto__.__proto__);



