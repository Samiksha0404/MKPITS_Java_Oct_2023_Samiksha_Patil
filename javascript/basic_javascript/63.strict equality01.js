let a = 2, b=2, c=3; 
let d = {name:"Ram"}; 
let e = {name:"Ram"}; 
let f = e; 
  
console.log(a===b); 
console.log(a===c); 
console.log(d===e); 
console.log(f===e);
//Just like other comparisons when two objects are compared their reference is checked and true is only returned if the reference is the same.