package StringBuilderAssignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DocumentService {

	List<Document> list = new ArrayList<Document>();
	Map<Document, Integer> map = new LinkedHashMap<Document, Integer>();

	public boolean addDocument(Document document) {
		return list.add(document);

	}

	public Document showDocument(String title) {
		for (Document document : list) {
			if (document.getTitle().equals(title)) {
				Integer count = 1;
				if (map.containsKey(document)) {
					count = map.get(document);
					map.put(document, count + 1);

				} else {
					map.put(document, count);
				}
				return document;

			}

		}
		return null;

	}

	public String getDocumentTitleFromPath(String path) {
		for (Document document : list) {
			if (document.getFilepath().equals(path)) {
				System.out.println(document.getId() + "" + document.getTitle() + "" + document.getStringCreateDate());

			}

		}
		return null;

	}

	public int totalNumberOfTimesDocumentRead() {
		for (Document document : map.keySet()) {
			System.out.println("Document" + document + "count :" + map.get(document));
		}
		return 0;

	}

	public static void main(String[] args) {
		Document document = new Document(1, "title1", "description1", "filepath1", new Date());
		Document document1 = new Document(2, "title2", "description2", "filepath2", new Date());
		Document document2 = new Document(3, "title3", "description3", "filepath3", new Date());
		DocumentService documentService = new DocumentService();
		documentService.addDocument(document);
		documentService.addDocument(document1);
		documentService.addDocument(document2);
		System.out.println(documentService.list.size());
		System.out.println(document);
		System.out.println(document1);
		System.out.println(document2);
		System.out.println("#");
		documentService.showDocument("title1");
		documentService.showDocument("title1");
		documentService.showDocument("title2");
		System.out.println("*");
		documentService.getDocumentTitleFromPath("filepath2");
		documentService.totalNumberOfTimesDocumentRead();

	}

}
