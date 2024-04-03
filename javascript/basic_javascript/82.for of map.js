const map = new Map([
  ["k1", "pizza"],
  ["k2", "momos"],
  ["k3", "vadapao"],
]);

for (const [key, value] of map) {
  console.log(`Key: ${key}, Value: ${value}`);
}
/*
map is the Map object you want to iterate over.
for (const [key, value] of map) initiates the for...of loop, where [key, value] represents each key-value pair in the Map during each iteration.
Inside the loop, console.log(Key: ${key}, Value: ${value}); prints each key-value pair to the console during each iteration of the loop.
*/
