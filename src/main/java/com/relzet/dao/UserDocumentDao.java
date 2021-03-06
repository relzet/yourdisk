package com.relzet.dao;

import com.relzet.model.UserDocument;

import java.util.List;
import java.util.Map;

public interface UserDocumentDao {

	List<UserDocument> findAll();
	
	UserDocument findById(int id);
	
	void save(UserDocument document);

	void updateDoc(UserDocument document);

	List<UserDocument> findAllByUserId(int userId);
	
	void deleteFolderById(int id);

	void deleteById(int docId, int currentFolderId);

	List<UserDocument> findAllInFolder(int userId, int docId);

	UserDocument findRootByUserId(int userId);

	List<UserDocument> findFoldersInFolder(int userId, int docId);

	List<UserDocument> findDocsInFolder(int userId, int docId);

	List<UserDocument> searchFoldersInFolder(int userId, int docId, String target);

	List<UserDocument> searchDocsInFolder(int userId, int docId, String target);

	List<UserDocument> filterDocsInFolder(int userId, int docId, String[] filters);

	boolean checkFolderNameUnique(int userId, int docId, String folderName);

	List<UserDocument> getTopFiles(int userId);

	Map<String, Long> getTypesStructure(int id);
}
