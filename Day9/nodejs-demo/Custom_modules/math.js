function add(a,b){
    return a+b;
}

function subtract(a,b){
    return a-b;
}

function multiply(a,b){
    return a*b;
}

function divide(a,b){
    if(b===0){
        throw new Error("Cannt divide by zero");
    
    }
    return a/b;
}

/// Exports the function so that it can be used in other files
module.exports = {
    add,
    divide,
    multiply
}

module.exports="I am math module";
module.exports.name = "Hello name"
module.exports.framework = 'hi';


