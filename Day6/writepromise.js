// function checkMail(){
//     return new Promise((resolve, reject) => {
//         if(Math.random()>0.5){
//             resolve("Mail received");
//         }
//         else{
//             reject("Mail not received");
//         }
//     });
// }


// //promise chaining: 
// checkMail().then((mail) => {
//     console.log("Succesful -- ",mail);
// }).catch((err)=>{
//     console.log("Error--",err)
// }).finally(()=>{
//     console.log("Finally - completed")
// })


// const p1 = Promise.resolve(555);
// p1.then((v)=>{
//     console.log(v);
// });

// let count = new Promise(function(resolve, reject){
//     reject('rejected');
// });
// count.then(function realValue(v){
//     console.log(v);
// }).catch(
//     function unreal(v){
//         console.log(v);
//     }
// );

let count = new Promise(function(resolve, reject){
    resolve('reesolved');
});
count.then(function realValue(v){
    console.log(v);})
// }).catch(
//     function unreal(v){
//         console.log(v);
//     }
// );
count.finally(
    console.log('fin exec.')
)


// const p2 = Promise.reject(555);
// p2.catch((v)=>{
//     console.log(v);
// });
// const prom = checkMail();
// prom.then(fullfill , reject);

// prom.catch(fullfill, reject)
