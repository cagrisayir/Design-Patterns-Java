import iterator.BrowseHistory;
import iterator.Iterator;
import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;
import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;
import template.AuditTrail;
import template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var auditTrail = new AuditTrail();
        var task = new TransferMoneyTask(auditTrail);
        task.execute();
    }
}
