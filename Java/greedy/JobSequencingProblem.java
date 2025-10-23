import java.util.Arrays;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    public static int solve(Job[] arr, int n) {
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxi) {
                maxi = arr[i].deadline;
            }
        }

        int result[] = new int[maxi + 1];

        for (int i = 1; i <= maxi; i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {

            for (int j = arr[i].deadline; j > 0; j--) {

                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;


        return jobProfit;
    }
}

public class JobSequencingProblem {
    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1, 2, 100);
        arr[1] = new Job(2, 1, 19);
        arr[2] = new Job(3, 2, 27);
        arr[3] = new Job(4, 1, 25);
        arr[3] = new Job(5, 1, 15);

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int res = Job.solve(arr, arr.length);

        System.out.println((res));
    }
}
