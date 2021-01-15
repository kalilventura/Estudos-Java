using System;
using System.Linq;
using Microsoft.AspNetCore.Mvc;
using PersonalDiary.Database;
using PersonalDiary.Models;

namespace PersonalDiary.Controllers {
    [Route ("api/[controller]")]
    [ApiController]
    public class EventsController : ControllerBase {

        private EventsContext _context;
        public EventsController (EventsContext context) {
            _context = context;
        }

        [HttpGet]
        public IActionResult Get () {
            try {
                var events = _context.Events.ToList ();
                return Ok (new { events });
            } catch (Exception ex) {
                return BadRequest (ex.Message);
            }
        }

        [HttpGet ("{id}")]
        public IActionResult Get (int id) {
            try {
                var events = _context.Events.FirstOrDefault (x => x.Id.Equals (id));
                return Ok (new { events });
            } catch (Exception ex) {
                return BadRequest (ex.Message);
            }
        }

        [HttpPost]
        public IActionResult Post (Events events) {
            try {
                _context.Events.Add (events);
                return Ok (new { message = "Successfully created event." });
            } catch (Exception ex) {
                return BadRequest (ex.Message);
            }
        }

        [HttpPut]
        public IActionResult Put (Events events) {
            try {
                _context.Events.Update (events);
                return Ok (new { message = "Event updated successfully." });
            } catch (Exception ex) {
                return BadRequest (ex.Message);
            }
        }

        [HttpDelete]
        public IActionResult Delete (Events events) {
            try {
                _context.Events.Remove (events);
                return Ok (new { message = "Event deleted successfully." });
            } catch (Exception ex) {
                return BadRequest (ex.Message);
            }
        }

    }
}