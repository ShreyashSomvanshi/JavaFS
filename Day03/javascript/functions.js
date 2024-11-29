function greet(){
    console.log("Hello, World!")
}

// let res = greet();
let res = function(){
    console.log("ph no: 57899")
}

greet()
console.log(res); //undefined

function cal(x,y){
    return x+y;
}

function disp(){
    console.log("hello");
    return "learning js";
    console.log("javascript");
}

let msg = disp();
console.log(msg);

let ans = cal(7,8);
console.log(`multi = ${ans}`)

function compare(emp1, emp2){
    if (emp1 > emp2) {
        console.log("Emp1 Salary is greater");
    } else {
        console.log("Emp2 Salary is greater");
    }
}

// var res = compare(100, 50);
// conso