const fs = require('fs');
const path = require('path');

const currentDir = process.cwd();
const filePath = path.join(currentDir,'file.txt');

fs.writeFile(filePath, 'Helllo its a test file ', (err)=>{
    if(err){
        console.error(err);
        return;
    }
    console.log('File written Successfully.');
    
    fs.readFile(filePath, 'utf-8', (err,data)=>{
        if(err){
            console.error(err);
            return;
        }
        console.log('File content: ', data);
        
    })
})