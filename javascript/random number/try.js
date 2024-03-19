let systemInput = Math.ceil(Math.random() * 100);
console.log(systemInput);

let guess = 0;
let userInput = parseInt(prompt(`Enter a number`));

let userInput1 = () => {
  userInput = parseInt(prompt(`enter correct number: `));
};
if (isNaN(userInput)) {
  alert("please enter  number only");
}
while (systemInput != userInput) {
  alert("Wrong input please try again");
  userInput1();
  guess++;
}
if (systemInput == userInput) {
  alert(`you have enter the correct its ${systemInput}`);
}
console.log("your guess are " + guess);
