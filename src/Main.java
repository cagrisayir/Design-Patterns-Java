import iterator.BrowseHistory;
import iterator.Iterator;
import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;
import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(
                new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStorage.store("A");
    }
}
