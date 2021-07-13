package com.citiustech.hms.inboxmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.citiustech.hms.inboxmanagement.dto.SendNoteVO;
import com.citiustech.hms.inboxmanagement.entity.Note;
import com.citiustech.hms.inboxmanagement.mapper.MapStructMapper;
import com.citiustech.hms.inboxmanagement.repository.NoteRepository;
import com.citiustech.hms.inboxmanagement.util.JwtUtil;

@Service
public class NoteServiceImpl implements NotesService {

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private NoteRepository noteRepo;

	@Autowired
	protected MapStructMapper mapper;

	@Override
	public String sendNotes(String authorization, SendNoteVO sendNotes) {

		// System.out.println("authorization"+authorization);
		System.out.println(sendNotes);

		// sendNotes.setToEmployeeId(0);
		Note note = mapper.sendNoteVOToNote(sendNotes);
		noteRepo.save(note);
		return "Note send succucessfully!";
	}

	@Override
	public List<Note> getAllNotes(String authorization) {
		// jwtUtil.extractClaim(authorization,claims->claims.get("id",String.class));

		String token = authorization.substring(7);

		System.out.println(jwtUtil.extractAllClaims(token));

		long id = jwtUtil.extractAllClaims(token).get("id", Long.class);

		Pageable pageable = PageRequest.of(0, 10, Sort.by("dateTime").ascending());

		Page<Note> page = noteRepo.findByfromEmployeeId(0, pageable);

		/*
		 * List<SendNoteVO> noteVO = new ArrayList<>();
		 * 
		 * if(page.hasContent()) { List<Note> notes=page.getContent();
		 * 
		 * notes.stream().forEach(e -> { noteVO.add(mapper.noteToSendNoteVO(e)); });
		 * 
		 * return noteVO; }
		 */

		return page.getContent();
	}

}
