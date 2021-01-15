using Microsoft.EntityFrameworkCore;
using PersonalDiary.Models;

namespace PersonalDiary.Database
{
    public class EventsContext : DbContext
    {
        public EventsContext(DbContextOptions<EventsContext> options): base(options) { }
        public DbSet<Events> Events {get; set;}
    }
}