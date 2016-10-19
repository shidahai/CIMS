package com.mvc.service.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.InvoiceDao;
import com.mvc.entity.Invoice;
import com.mvc.repository.InvoiceRepository;
import com.mvc.service.InvoiceService;

/**
 * 发票
 * 
 * @author zjn
 * @date 2016年9月16日
 */
@Service("invoiceServiceImpl")
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	InvoiceRepository invoiceRepository;
	@Autowired
	InvoiceDao invoiceDao;

	// 根据发票ID查询发票详情
	public Invoice findById(Integer invoiceId) {

		return invoiceRepository.findById(invoiceId);
	}

	// 根据发票id删除发票
	public boolean delete(Integer invoiceId) {
		return invoiceDao.delete(invoiceId);
	}

	// 根据合同id，页数返回发票列表
	public List<Invoice> findByContId(Integer cont_id, Integer offset, Integer end) {
		return invoiceDao.findByContId(cont_id, offset, end);
	}

	// 根据合同ID查询发票总条数
	public Integer countByContId(Integer cont_id) {
		return invoiceDao.countByContId(cont_id);
	}

	// 根据合同ID查询发票总金额
	public Float totalMoneyOfInvoice(Integer contId) {
		return invoiceDao.totalMoneyOfInvoice(contId);
	}

	// 创建发票
	public boolean save(Invoice invoice) {
		Invoice invoiceResult = invoiceRepository.saveAndFlush(invoice);
		if (invoiceResult.getInvo_id() != null) {
			return true;
		} else
			return false;
	}

	// 根据用户id，页数返回发票列表
	public List<Invoice> findByPage(Integer user_id, Integer ifSend, Integer offset, Integer end) {
		return invoiceDao.findByPage(user_id, ifSend, offset, end);
	}

	// 根据用户ID查询发票总条数
	public Integer countByParam(Integer user_id, Integer ifSend) {
		return invoiceDao.countByParam(user_id, ifSend);
	}

	// 按发票状态获取列表
	public Integer WaitingDealCountByParam(Integer user_id, Integer invoiceState) {
		return invoiceDao.WaitingDealCountByParam(user_id, invoiceState);
	}

	// 根据用户id，页数返回发票列表
	public List<Invoice> WaitingDealFindByPage(Integer user_id, Integer invoiceState, Integer offset, Integer end) {
		return invoiceDao.WaitingDealFindByPage(user_id, invoiceState, offset, end);
	}

	// 点击完成发票任务
	public boolean invoiceFinish(Integer invoiceId, Date invoTime) {
		return invoiceDao.invoiceFinish(invoiceId, invoTime);
	}

	// 主任转发发票
	public boolean transmitInvoice(Integer invoiceId, Date invoEtime, Integer receiverId) {
		return invoiceDao.transmitInvoice(invoiceId, invoEtime, receiverId);
	}

}
