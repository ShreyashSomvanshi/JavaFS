// importing the custom module
const math = require('./math');

const num1 = 20;
const num2 = 5;

console.log(`Addition: ${math.add(num1, num2)}`);

console.log(`Division: ${math.divide(num1, num2)}`);

console.log(`Multiplication: ${math.multiply(num1, num2)}`);

console.log(math.name, ' , ',math.frmwork);

try{
    console.log(`Division by zero: ${math.divide(num1, 0)}`);
}catch(error){
    console.log(error.message);
}

