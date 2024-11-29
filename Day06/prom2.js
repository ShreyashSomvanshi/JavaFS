let myYes = new Promise((resolve, reject) =>{
    let student;
    setTimeout(()=>{
        student = "learn JS";

        if(student){
            resolve(student);
        }
        else{
            reject();
        }
    })
})

let myPromise = new Promise(function(resolve, reject){
    setTimeout(function(){resolve("Javascript promise")}, 3000);
});

myPromise.then(function(value){
    console.log(value);
});


