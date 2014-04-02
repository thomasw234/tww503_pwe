public interface IExecutionListener {

	public void aboutToExecute(AST ast, IEolContext context);

	public void finishedExecuting(AST ast, Object result, IEolContext context);
}
