/*
let emp = {name:"Raj"} //[[prototype: Object]]
// emp.toString();
const day = new Date();
let object = day;

do{
    object = Object.getPrototypeOf(object);
    console.log(object);
}while(object);


const myObj = {
    name: "John",
    welcome(){
        console.log(`Welcome to my home ${this.name}`);
    }
};

myObj.welcome();

*/

function Employee(name, designation, yearOfBirth){
    this.name=name;
    this.designation =designation;
    this.yearOfBirth = yearOfBirth;
}

Employee.prototype.calculateAge = function(){
    console.log('the current age is: '+(2024-this.yearOfBirth));
}
console.log(Employee.prototype);

let emp1 = new Employee('Alex', 'Tester', 1995);
console.log(emp1);
console.log(emp1.calculateAge());

let emp2 = new Employee('Dexter', 'Dev', 1998);
console.log(emp2);
console.log(emp2.calculateAge());

let emp3 = new Employee('Jon', 'Web D', 1999);
console.log(emp3);
console.log(emp3.calculateAge());

function Car(){
    this.name = "Mustang";
}
Car.prototype.color = "red";

let C1 = new Car();
console.log(`Color of carr before change ${C1.color}`);
// access prototype objext of c1
console.log(Object.getPrototypeOf(C1));

Car.prototype.color = "white";
// color: red
let c2 = new Car();
console.log(`color of car after change ${C1.color}`);
console.log(`color of car C2 ${c2.color}`);



