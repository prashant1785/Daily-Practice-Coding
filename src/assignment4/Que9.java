/*Thread Pool
• Create a thread pool using the ExecutorService.
• Submit 5 tasks to the thread pool where each task prints:
• The thread name (Thread.currentThread().getName()).
• A unique task identifier (e.g., "Task 1", "Task 2", etc.).
• Ensure the thread pool shuts down gracefully after completing all tasks.
 */

package assignment4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
    private final String taskName;

    public Task(String taskName)
    {
        this.taskName = taskName;
    }
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " exceuting " + taskName);
    }
}
public class Que9
{
    public static void main(String[] args)
    {
        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++)
        {
            es.submit(new Task("Task " + i));
        }
        es.shutdown();
    }
}
