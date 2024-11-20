// Javascript object
const student = {
    firstname: "Ram",
    rollno: 303,
    subject: 'CS',
    displayInfo : function(){
        console.log("Info of students");
    }
};

student.firstname = "Damini";
student.skill = "Java";
student.displayInfo();
console.log(student.firstname);
console.log(student);
delete student.rollno;
console.log(student);

const person = {
    title: {
        doctor: "Doc",
        Engineer: "Engg"
    },
    name: ["sajal", "badal", "sumi"],
    age:[22,23,25],
    bio: function(){
        console.log(`${this.name[0]} {this.name[1]} {this.name[2]} is ${this.age[0]} ${this.age[1]} ${this.age[2]} years old`)
    },
    intro(){
        console.log("INtro in person")
    }
}

person.bio();
person.intro();

console.log(person);
console.log(person.title.doctor);

let s1={
    name: "raj",
    intro(){
        console.log(`Hi, i'm ${this.name}`)
    }
};


let s2={
    name: "raj",
    intro(){
        console.log(`Hi, i'm ${this.name}`)
    }
};

function createPerson(name){
    const obj = {};
    obj.name = name;
    obj.intro = function(){
        console.log(`Hello everyone, I'm ${this.name}`);
    };
    return obj;
}

const mona = createPerson("Mona");
mona.intro();

const sona = createPerson("Sona");
sona.intro();

//real constructor
function Person(name){
    // const obj = {};
    this.name = name;
    this.intro = function(){
        console.log(`Hello everyone, I'm ${this.name}`);
    };
    // return obj;
}

const m = new Person("Mona using constructor");
m.intro();

const s = new Person("Sona");
s.intro();



function Emp(name, id, skill, exp, sal){
    // const obj = {};
    this.name = name;
    this.id = id;
    this.skill = skill;
    this.exp = exp;
    this.sal = sal;
    this.intro = function()
    {
        if (exp >= 10) 
            {
            this.sal = 1.20 * sal;
            console.log(`Employee name is: ${this.name}, id is ${this.id}, skill is ${this.skill}, sal incremented: ${this.sal}`);
          }
       else {
        console.log(`Employee name is: ${this.name}, id is ${this.id}, skill is ${this.skill}, sal is ${this.sal}`);
      }
    }
        
    // return obj;
}

const e1 = new Emp('Empl1', 101, 'C', 8, 10000);
e1.intro();

const e2 = new Emp('Empl2', 102, 'java', 10, 10000);
e2.intro();

// built in constructor

const o1 = new Object({name:'Amit', age: 30});
const o2 = new String("John");
const o3 = new Number(678);
const o4 = new Boolean(true);

console.log(o1);
console.log(o2);
console.log(o4);
