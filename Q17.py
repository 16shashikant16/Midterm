class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        else:
            return None

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        else:
            return None

    def is_empty(self):
        return len(self.stack) == 0

    def size(self):
        return len(self.stack)


# Example usage:
stack = Stack()

# Pushing items onto the stack
stack.push(5)
stack.push(10)
stack.push(15)

# Popping items from the stack
print(stack.pop())  # Output: 15
print(stack.pop())  # Output: 10

# Peeking at the top of the stack
print(stack.peek())  # Output: 5

# Checking if the stack is empty
print(stack.is_empty())  # Output: False

# Checking the size of the stack
print(stack.size())  # Output: 1
