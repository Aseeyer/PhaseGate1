grocery_list = []



def show_menu():
    print("\nWhat would you like to do today on your grocery app?")
    print("1. Add an Item")
    print("2. Remove an Item")
    print("3. Show All Items")
    print("0. Exit the grocery app")



def get_user_choice():
    try:
        return int(input("Enter choice: "))
    except ValueError:
        print("Dear Sir, this is an invalid input. Please enter a number.")
        return -1



def add_item():
    item = input("Enter any item of your choice to add: ")
    grocery_list.append(item)
    print(f"'{item}' added successfully!")



def remove_item():
    item = input("Enter item to remove: ")
    if item in grocery_list:
        grocery_list.remove(item)
        print(f"'{item}' removed successfully!")
    else:
        print(f"'{item}' not found in the list.")



def show_items():
    print("\n=-=-=-= Grocery List =-=-=-=")
    if not grocery_list:
        print("No items in the list.")
    else:
        for i, item in enumerate(grocery_list, start=1):
            print(f"{i}. {item}")








def main():
    print("What is your name?")
    user_name = input().upper()
    print(f"Welcome Mr {user_name} to your personal grocery app")
    print(f"\n|=-=-=-= {user_name} Manager App =-=-=-=|")

    running = True
    while running:
        show_menu()
        choice = get_user_choice()

        if choice == 1:
            add_item()
        elif choice == 2:
            remove_item()
        elif choice == 3:
            show_items()
        elif choice == 0:
            print("Exiting Grocery Manager App. Goodbye!")
            running = False
        else:
            print("Invalid choice. Please select a valid option.")
