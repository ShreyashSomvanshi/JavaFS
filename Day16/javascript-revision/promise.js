// let promise = new Promise(function (res, rej){
//     setTimeout(()=>{
//         res('success');
//     }, 1000);
// });

// promise.then(
//     result=>alert(result),
//     error=>alert(error)
// );

let prom = new Promise((resolve, reject)=>{
    let success = true;
    if(success){
        resolve("Promise resolved");
    }
    else{
        reject('Promise rejected');
    }
});

prom.then(result=>console.log(result));

prom.catch(error=>console.log(error));

// ======================


let fetchData = (ms) =>{return new Promise((resolve, reject)=>{
    if(ms>0){
        setTimeout(()=>resolve('Task completed!'), ms);
    }else{
        reject('invalid time :(');
    }
});};

fetchData(-2000)
.then(result => console.log(result))
.catch(error=>console.log(error));


