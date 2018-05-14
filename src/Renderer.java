
public class Renderer extends JComponent{
	public Queue<JComponent> renderQueue;
    public Queue<JComponent> liveQueue;
	public Renderer(){
		renderQueue = new Queue<JComponent>();
        liveQueue = new Queue<JComponent>();
	}
	public void liveItem(JComponet obj){
        win.remove(liveQueue.dequeue());
        liveQueue.enqueue(obj);
        win.add(obj);
	}
}