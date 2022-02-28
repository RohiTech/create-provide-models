package org.evenos.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MOrder extends X_C_Order
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2196027413272474507L;


	public MOrder(Properties ctx, int C_Order_ID, String trxName) {
		super(ctx, C_Order_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MOrder(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		return super.beforeSave(newRecord);
	}
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}
	
	@Override
	protected boolean beforeDelete() {
		// TODO Auto-generated method stub
		return super.beforeDelete();
	}
	
	@Override
	protected boolean afterDelete(boolean success) {
		// TODO Auto-generated method stub
		return super.afterDelete(success);
	}	
}
