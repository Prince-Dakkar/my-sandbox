def sum_even_greater_than_12(numbers):
    total = 0
    for num in numbers:
        if num % 2 == 0 and num > 12:
            total += num
    return total

# Example usage
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

result = sum_even_greater_than_12(numbers)
print(result)
             