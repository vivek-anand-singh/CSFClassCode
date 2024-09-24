package mergesort;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Client
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = List.of(5,4,3,2,1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list,executorService);

        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        System.out.println(sortedListFuture.get());
    }
}