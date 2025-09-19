def main():
    import sys

    # Read all input from standard input
    lines = sys.stdin.read().strip().splitlines()
    if not lines:
        return

    # First line tells us the number of test cases
    num_cases = int(lines[0].strip())
    results = []

    # Go through each test case, two lines at a time
    line_index = 1
    for _ in range(num_cases):
        try:
            # First line of the case = how many numbers to expect
            expected_count = int(lines[line_index].strip())
            numbers = list(map(int, lines[line_index + 1].strip().split()))
        except:
            results.append(-1)  # If input is malformed
            line_index += 2
            continue

        # If the count doesn't match the actual number of integers, mark as invalid
        if len(numbers) != expected_count:
            results.append(-1)
        else:
            # Compute sum of fourth powers of non-positive numbers
            total = 0
            for num in numbers:
                if num <= 0:
                    total += num ** 4
            results.append(total)

        # Move to next test case
        line_index += 2

    # Prepare output as text
    output_text = "\n".join(map(str, results))

    # Print results to terminal
    print(output_text)

    # Also save results to a file
    with open("output_results.txt", "w") as f:
        f.write(output_text + "\n")


if __name__ == "__main__":
    main()


###Thank You So Much 