let a = 1; 
let b = 1; 
let c = new String("Hello"); 
let d = new String("Hello"); 
let e = "Hello"; 
  
console.log(a==b); 
console.log(c==d); 

//Even though c, d, and e are all strings but their comparison in one case returned false because when String is created with the help of Constructor it is treated as an object so when we are comparing c and d two objects are compared and only their reference is being checked which is different but when c is compared with e type conversion takes place and both are compared as a string which returns true.