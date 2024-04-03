let cities = ["Delhi", "Noida", "Dehradun", "Haldwani", "Haridwar"]; 
let start_with_D = " "; 
for (city in cities) { 
    if (cities[city].startsWith("D")) { 
        let names = cities[city] + " "; 
        start_with_D += names 
    } 
} 
  
console.log(start_with_D);
// Here we use an operator to add filtered content to a string