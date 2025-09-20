func sumOfUnique(nums []int) int {
	// Build a frequency map: number → how many times it appears
	freq := make(map[int]int, len(nums))
	for _, val := range nums {
		freq[val]++
	}

	ans := 0
	// Sum up all numbers that appear exactly once
	for num, count := range freq {
		if count == 1 {
			ans += num
		}
	}

	return ans
}
