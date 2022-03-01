package org.evenos.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MOrder;
import org.compiere.util.CLogger;

public class MOrder_Evenos extends MOrder
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2196027413272474507L;
	
	CLogger log = CLogger.getCLogger(MOrder_Evenos.class);

	public MOrder_Evenos(Properties ctx, int C_Order_ID, String trxName) {
		super(ctx, C_Order_ID, trxName);
		// TODO Auto-generated constructor stub
		log.warning("Constructor 1");
	}
	
	public MOrder_Evenos(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
		log.warning("Constructor 2");
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		log.warning("beforeSave method");
		return super.beforeSave(newRecord);
	}
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		log.warning("afterSave method");
		return super.afterSave(newRecord, success);
	}
	
	@Override
	protected boolean beforeDelete() {
		// TODO Auto-generated method stub
		log.warning("---------------");
		return super.beforeDelete();
	}
	
	@Override
	protected boolean afterDelete(boolean success) {
		// TODO Auto-generated method stub
		log.warning("---------------");
		
		/*log.severe("");
		log.warning("");
		log.info("");
		log.config("");
		log.fine("");
		log.finer("");
		log.finest("");*/
		
		return super.afterDelete(success);
	}	
}
