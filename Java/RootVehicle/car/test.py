def main():
    import sys

    data = sys.stdin.read().strip().splitlines()
    if not data:
        return

    def process_case(idx, acc):
        if idx >= len(data):
            return acc

        try:
            x = int(data[idx].strip())
            numbers = list(map(int, data[idx + 1].strip().split()))
        except:
            return acc + [-1]

        if len(numbers) != x:
            return process_case(idx + 2, acc + [-1])

        def calc(nums, i, total):
            if i >= len(nums):
                return total
            val = nums[i]
            if val <= 0:
                return calc(nums, i + 1, total + val ** 4)
            return calc(nums, i + 1, total)

        return process_case(idx + 2, acc + [calc(numbers, 0, 0)])

    results = process_case(1, [])
    sys.stdout.write("\n".join(map(str, results)))


if __name__ == "__main__":
    main()
