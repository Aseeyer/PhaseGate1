const prompt = require("prompt-sync")

let groceryList = [];

console.log("What is your name?");
let userName = prompt("> ").toUpperCase();
console.log(`Welcome Mr ${userName} to your personal grocery app`);
console.log(`\n|=-=-=-= ${userName} Manager App =-=-=-=|`);

let running = true;

while (running) {
  showMenu();
  let choice = prompt("> ");

  switch (choice) {
    case "1":
      addItem();
      break;
    case "2":
      removeItem();
      break;
    case "3":
      showItems();
      break;
    case "0":
      running = false;
      console.log("Exiting Grocery Manager App. Goodbye!");
      break;
    default:
      console.log("Invalid choice. Please select a valid option.");
  }
}

function showMenu() {
  console.log("\nWhat would you like to do today on your grocery app?");
  console.log("1. Add an Item");
  console.log("2. Remove an Item");
  console.log("3. Show All Items");
  console.log("0. Exit the grocery app");
}

function addItem() {
  let item = prompt("Enter any item of your choice to add: ");
  groceryList.push(item);
  console.log(`'${item}' added successfully!`);
}

function removeItem() {
  let item = prompt("Enter item to remove: ");
  let index = groceryList.indexOf(item);

  if (index !== -1) {
    groceryList.splice(index, 1);
    console.log(`'${item}' removed successfully!`);
  } else {
    console.log(`'${item}' not found in the list.`);
  }
}

function showItems() {
  console.log("\n--- Grocery List ---");
  if (groceryList.length === 0) {
    console.log("No items in the list.");
  } else {
    groceryList.forEach((item, i) => {
      console.log(`${i + 1}. ${item}`);
    });
  }
}
