package jade;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import java.net.http.HttpClient;

public class Window {
private int width, height;
private String title;

private static Window window = null;


    //private constructor
    private Window(){
        this.width = 1920;
        this.height = 1080;
        this.title = "Jade Engine";
    }

public static Window get() {
    if (Window.window == null) {
        Window.window = new Window();
    }
    return Window.window;
}

public void run() {
    System.out.println("Hello LWGJL");

    init();
    loop();
}

public void init() {
   // Set up error callback
    GLFWErrorCallback.createPrint(System.err).set();


}

public void loop() {
    System.out.println("Game loop running");}


}
