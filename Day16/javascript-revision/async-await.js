/* 
async function demo(){
let res = await someAsyncfunc()
console.log(result);
}
*/

function fetchData(success){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            if(success){
                resolve('data fetched')
            }else{
                reject('error');
            }
        }, 1000);
    });
};



// async function getData(){ // async behaves and looks like sync functions
//     console.log('Fetching data ');
//     const data = await fetchData(); // waits for fetchData to resolve
//     console.log(data); // this will not run till fetchData() completes
// }
// getData();


async function getData(success) {
    try{
        console.log('fetching data');
        const data = await fetchData(success);
        console.log(data);
        
    }catch(error){
        console.log('caught and error', error);
        
    }
}

getData(true);
// getData(false);
// getData();

