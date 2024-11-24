// function fatchData(callback){
//     const data = {name: "Seems", age:30};
//     callback(data);
// }

function first(sec){
    
    console.log('first fun');
}

function second(third){
    console.log('sec fun');
}

function third(){
    console.log('third fun');
}

first(second(third()));

