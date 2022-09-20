/**
 * 
 */
package org.opencps.kyso.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.TextPosition;

/**
 * @author ddung
 *
 */
public class ExtractTextLocationsHSM extends PDFTextStripper {
	private float anchorX = 0;
	private float anchorY = 0;
	private float signatureWidth = 0;
	private float signatureHeight = 0;
	private float pageWidth = 0;
	private float pageHeight = 0;
	private float pageLLX = 0;
	private float pageURX = 0;
	private float pageLLY = 0;
	private float pageURY = 0;

	private int pageSize = 1;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public ExtractTextLocationsHSM() throws IOException {
		super.setSortByPosition(true);
	}

	public ExtractTextLocationsHSM(String fullPath) throws IOException {
		PDDocument document = null;
		try {
			File input = new File(fullPath);
			document = PDDocument.load(input);

			if (document.isEncrypted()) {
				try {
					document.decrypt("");
				} catch (Exception e) {
					_log.error(e);
				}
			}

			List allPages = document.getDocumentCatalog().getAllPages();

			if (allPages != null && allPages.size() > 0) {
				setPageSize(allPages.size());
				PDPage page = (PDPage) allPages.get(allPages.size() - 1);

				PDStream contents = page.getContents();
				if (contents != null) {
					this.processStream(page, page.findResources(), page.getContents().getStream());
				}

				PDRectangle pageSize = page.findMediaBox();

//				_log.info("-------------------------Width:" + pageSize.getWidth());
//				_log.info("-------------------------Height:" + pageSize.getHeight());
//				_log.info("-------------------------LowerLeftX:" + pageSize.getLowerLeftX());
//				_log.info("-------------------------UpperRightX:" + pageSize.getUpperRightX());
//				_log.info("-------------------------LowerLeftY:" + pageSize.getLowerLeftY());
//				_log.info("-------------------------UpperRightY:" + pageSize.getUpperRightY());

				if (pageSize != null) {
					setPageWidth(pageSize.getWidth());
					setPageHeight(pageSize.getHeight());
					setPageLLX(pageSize.getLowerLeftX());
					setPageURX(pageSize.getUpperRightX());
					setPageLLY(pageSize.getLowerLeftY());
					setPageURY(pageSize.getUpperRightY());
				}
			}
		}

		catch (Exception e) {
		} finally {
			if (document != null) {
				document.close();
			}
		}
	}

	@Override
	protected void processTextPosition(TextPosition text) {
		if (text.getCharacter().equals(StringPool.POUND) && text.getFontSize() == 1L) {

			setAnchorX(text.getX());
			setAnchorY(text.getY());
			setSignatureHeight(text.getHeight());
			setSignatureWidth(text.getWidth());
		}

	}

	public float getAnchorX() {
		return anchorX;
	}

	public void setAnchorX(float anchorX) {
		this.anchorX = anchorX;
	}

	public float getAnchorY() {
		return anchorY;
	}

	public void setAnchorY(float anchorY) {
		this.anchorY = anchorY;
	}

	public float getSignatureWidth() {
		return signatureWidth;
	}

	public void setSignatureWidth(float signatureWidth) {
		this.signatureWidth = signatureWidth;
	}

	public float getSignatureHeight() {
		return signatureHeight;
	}

	public void setSignatureHeight(float signatureHeight) {
		this.signatureHeight = signatureHeight;
	}

	public float getPageWidth() {
		return pageWidth;
	}

	public void setPageWidth(float pageWidth) {
		this.pageWidth = pageWidth;
	}

	public float getPageHeight() {
		return pageHeight;
	}

	public void setPageHeight(float pageHeight) {
		this.pageHeight = pageHeight;
	}

	public float getPageLLX() {
		return pageLLX;
	}

	public void setPageLLX(float pageLLX) {
		this.pageLLX = pageLLX;
	}

	public float getPageURX() {
		return pageURX;
	}

	public void setPageURX(float pageURX) {
		this.pageURX = pageURX;
	}

	public float getPageLLY() {
		return pageLLY;
	}

	public void setPageLLY(float pageLLY) {
		this.pageLLY = pageLLY;
	}

	public float getPageURY() {
		return pageURY;
	}

	public void setPageURY(float pageURY) {
		this.pageURY = pageURY;
	}

	private Log _log = LogFactoryUtil.getLog(ExtractTextLocationsHSM.class);
}
