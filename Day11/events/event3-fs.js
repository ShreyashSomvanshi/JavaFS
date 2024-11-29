// lets use the event to listen file changes,
// such when file is read or written to..

// import fs module
const fs = require('fs');

// fs.createReadStream()- 
const readstream = fs.createReadStream('example.txt', 'utf-8');


// data event is emitted each time a chunk of data is received from 
//  the file, calback will execute to process that chunk
readstream.on('data', (chunk)=>{
    console.log('new data chunk received ');
    console.log('Content in file: ', chunk);
    
});

// listen for end event, triggered when file fully read
readstream.on('end', ()=>{
    console.log('File reading completed !');
    
});

// listen for error, event which trigerred in case of error
readstream.on('error', (err)=>{
    console.log('Error reading file ', err);
    
})


