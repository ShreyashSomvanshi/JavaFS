function fun1(name, callback){
    console.log('Hello ');
    callback(name);
}

function callme(name){
    setTimeout(()=>{
        console.log('callback func');
    console.log('hi name: ', name);
    }, 3000);
    // console.log('callback func');
    // console.log('hi name: ', name);   
}

setTimeout(fun1, 3000, 'Shr', callme);
// setTimeout()
// fun1('Preeti', callme);

console.log('---------');

function dispTime(){
    let ;
    
}
