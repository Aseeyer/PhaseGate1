def get_likes(names):
    count = len(names)

    if count == 0:
        return "no one likes this"
    elif count == 1:
        return f"{names[0]} likes this"
    elif count == 2:
        return f"{names[0]} and {names[1]} like this"
    elif count == 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {count - 2} others like this"


print(get_likes([]))
print(get_likes(["Peter"]))
print(get_likes(["Jacob", "Alex"]))
print(get_likes(["Max", "John", "Mark"]))
print(get_likes(["Alex", "Jacob", "Mark", "Max"]))
