static int calculateAverage(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        return 0; // Or throw new IllegalArgumentException("Array must not be empty");
    }
    int sum = 0;
    for (int n : numbers) {
        sum += n;
    }
    return sum / numbers.length;
}